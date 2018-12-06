---
id: version-1.0.0-cli
title: Command Line Tool
original_id: cli
---
## Commands

- maka app
> 下面的命令，会创建了一个名为test应用
```bash
maka app test 
```


- maka start
> 下面的命令，会启动app webpack dev server，可以通过浏览器访问应用的运行结果, http://127.0.0.1:8000
```bash
maka start 
maka start --dev //dev模式启动
```


- maka build
> 下面的命令，会编译应用，在当前目录build目录下生成编译结果
```bash
maka build 
maka build --dev //dev模式编译
```


- maka pkg
> 下面的命令，会打包应用, 在当前目录build目录下生成打包结果，打包结果可用于网站直接部署使用
```bash
maka pkg
maka pkg --dev //dev模式打包
```


- maka add
> 下面的命令，会为当前app增加依赖，增加依赖会修改package.json文件，start或者pkg命令时会把依赖app的编译结果copy当前应用运行目录下
```bash
maka add appName
```


- maka adduser
> 下面的命令，类似npm adduser功能，成功会在hub.makajs.org创建用户，并登录
```bash
maka adduser
```


- maka publish
> 下面的命令，会将当前app publish到hub.makajs.org,其他开发人员就可以通过maka add来引用您发布的应用，注意publish前请使用 maka build 、maka build --dev 、maka pkg 构建应用资源
```bash
maka publish
```
