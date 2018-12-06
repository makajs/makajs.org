---
id: build
title: "Build the source code"
---
Verdaccio relies on `yarn` instead `npm` to download depenedencies.

*Note: the current build only will build with `➜ yarn` latest.*

```bash
  yarn install
```

## Scripts

We have a list of scripts that you will use for diferent kind of tasks, in the following section we describe all posible task based on branches.

### Branch (2.x)

On branch `2.x` the unique part we have to build is the UI which is based on React.js, webpack and CSS Modules.

#### Scripts

| script           | Description                                                                                                                           |
| ---------------- | ------------------------------------------------------------------------------------------------------------------------------------- |
| release          | this script is used to generate changelog and raise up the version according the commits messages                                     |
| prepublish       | it ensures before publish the new ui is being generated                                                                               |
| test             | run all the test                                                                                                                      |
| pre:ci           | specific task for CI, build the UI required for test                                                                                  |
| test:ci          | run test generating coverage                                                                                                          |
| test:only        | run only test                                                                                                                         |
| test:coverage    | run `nyc` as a wrapper to generate coverage with mocha test                                                                           |
| coverage:html    | run `nyc` to generate coverage reports                                                                                                |
| coverage:publish | publish on `codecov` the coverage (don't use it)                                                                                      |
| lint             | run the linting for javascript code.                                                                                                  |
| lint:css         | run the linter for `css`                                                                                                              |
| dev:webui        | run a `webpack` server with hot reloading enabled `http://localhost:4872/#/` it requires a `verdaccio` server running in port `4873`. |
| pre:webpack      | prepare the field for webpack (it a substask of `build:webui`)                                                                        |
| build:webui      | create the static assets for the UI with `webpack`                                                                                    |
| build:docker     | create a local docker image with `verdaccio`                                                                                          |
| build:rpi        | create a local docker for raspberry pi image with `verdaccio` **(experimental with no support)**                                      |

#### Master branch (3.x)

The current major version is based on `babel` and `flow`. If you switch from master ensure to run `yarn install` again.

*Note: Only new scripts in bold*

### Scripts

| script           | Description                                                                                                                           |
| ---------------- | ------------------------------------------------------------------------------------------------------------------------------------- |
| **flow**         | run flow check                                                                                                                        |
| **dev:start**    | run `babel-node` and transpile code on memory                                                                                         |
| **code:build**   | transpile `verdaccio` with `babel` and copy transpiled code to `build/`                                                               |
| release          | this script is used to generate changelog and raise up the version according the commits messages                                     |
| prepublish       | it ensures before publish the new ui is being generated                                                                               |
| test             | run all the test `jest`                                                                                                               |
| test:unit        | run the unit test                                                                                                                     |
| test:func        | run the funtional test                                                                                                                |
| pre:ci           | specific task for CI, build the UI required for test                                                                                  |
| pretest          | A shorcut for transpile the code                                                                                                      |
| test:ci          | run test generating coverage                                                                                                          |
| coverage:publish | publish on `codecov` the coverage (CI task specific, do not use it)                                                                   |
| lint             | run the linting for javascript code.                                                                                                  |
| lint:css         | run the linter for `css`                                                                                                              |
| dev:webui        | run a `webpack` server with hot reloading enabled `http://localhost:4872/#/` it requires a `verdaccio` server running in port `4873`. |
| pre:webpack      | prepare the field for webpack (it a substask of `build:webui`)                                                                        |
| build:webui      | create the static assets for the UI with `webpack`                                                                                    |
| build:docker     | create a local docker image with `verdaccio`                                                                                          |
| build:rpi        | create a local docker for raspberry pi image with `verdaccio` **(experimental with no support)**                                      |