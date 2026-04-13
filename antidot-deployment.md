# Antidot Deployment Guide

This document describes how to build, test, and release flexmark-java to the internal Antidot Maven repository hosted on GitLab.

## Target repository

Artifacts are published to the internal Antidot GitLab Maven registry:

```
https://scm.mrs.antidot.net/api/v4/projects/672/packages/maven
```

This is configured in the root `pom.xml` under `<distributionManagement>`.

## Opening the project in IntelliJ IDEA

Install Maven if needed:

```bash
brew install maven
```

Then in IntelliJ IDEA, right-click the root `pom.xml` and select **Add as Maven Project**. IDEA will import all 58 modules automatically.

## Managing multiple GitHub accounts

Having both a personal and a professional GitHub account on the same machine can cause issues: SSH will use the first key available in the agent, which may not match the expected account.

A simple solution is to explicitly specify which SSH key to use via the `GIT_SSH_COMMAND` variable:

```bash
GIT_SSH_COMMAND='ssh -i ~/.ssh/id_ed25519_gitlab -o IdentitiesOnly=yes' git push
```

This can be prepended to any git command (`push`, `pull`, `fetch`, etc.) without affecting the global configuration.

## Continuous Integration

A GitHub Actions workflow runs on every push and on pull requests targeting `master`. It builds the project and runs the test suite on Java 21.

See: [`.github/workflows/ci.yml`](.github/workflows/ci.yml)

The CI does **not** deploy automatically — releases are triggered manually.

## Known test limitations

Two tests are intentionally disabled:

- **Pegdown profile tests** — skipped on Java 9+. Pegdown's underlying parser (Parboiled) relies on reflective access to JVM internals that have been restricted since Java 9, causing a runtime error. These tests only work on Java 8.
- **Abbreviation/typographic quotes interaction test** — marked as ignored. The test is locale-sensitive: abbreviation matching for accented characters (e.g. `É.U.`) behaves inconsistently across systems due to how Java handles regex word boundaries with non-ASCII characters.
