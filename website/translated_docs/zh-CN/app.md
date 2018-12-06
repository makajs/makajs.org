---
id: version-1.0.0-app
title: app
original_id: app
---

*app即可以独立运行、调试、分享，也可以通过弱耦合的方式又能组成一个网站*

- app来源
  - maka add 命令从hub.makajs.org下载应用，类似yarn add
  - package.json中subAppDir属性指向maka应用的存储目录
  - 拷贝app.js 和 app.css到发布目录
  
- 通过AppLoader组件加载子应用

```javascript
const view = {
    component: 'div',
    className: 'hello',
    children: [{
        component: 'AppLoader',
        appName: 'app-test', //app name
        content: 'hello' //app支持的属性
    }]
}
```

- 手工创建
```javascript
import {createAppElement} from 'maka'
...
var ele = createAppElement('appName', {content: 'hello'}) //第一个参数：app name,第二参数：app props
...
```

- 预加载
修改index.html
```javascript
 maka.load(['appName1', 'appName2']).then(()=>{
     ...
 }
```

- navigate切换

```javascript
import {navigate} from 'maka'

navigate.redirect('/appName/')
```