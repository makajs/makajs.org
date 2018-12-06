---
id: version-1.0.0-cli
title: Command Line Tool
original_id: cli
---
## Commands

- maka app
> Create a maka app called 'test'
```bash
maka app test 
```


- maka start
> Start the app webpack dev server, browse <a href='http://localhost:8000' target='maka dev'>http://localhost:8000</a> to view the running results of the maka app.
```bash
maka start 
maka start --dev //Start in dev mode
```


- maka build
> Compile the maka app and generate the compilation result in the 'build' directory.
```bash
maka build 
maka build --dev //Start in dev mode
```


- maka pkg
> Package the maka app, generate the package result in the 'build' directory
```bash
maka pkg
maka pkg --dev //Start in dev mode
```


- maka add
> Add a sub-application will modify the package.json file. When the start or pkg command is executed, the compilation result of the sub-application will be copied under the running directory.
```bash
maka add appName
```


- maka adduser
> Create a user at hub.makajs.org and log in, similar to the npm adduser function
```bash
maka adduser
```


- maka publish
> Publish current maka app to hub.makajs.org, other developers can refer to your published app via 'maka add'. Please use 'maka build', 'maka pkg' to build application resources before publishing.

```bash
maka publish
```
