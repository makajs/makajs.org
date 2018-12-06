---
id: version-1.0.0-api
title: Maka Api
original_id: api
---

```javascript 
import {registerComponent, registerAction} from 'maka'
```
*如上registerComponent,reigsterAction是两个api,所有支持的api如下*

api | 参数 |  描述 | 
--- | -- | -- | 
registerComponent | (key, component)  | 注册组件
registerAction | (key, action) | 注册行为
registerTemplate | (key, template) | 注册模板
getComponent | (key) | 通过组件名获取组件
load | [应用名...] | 加载应用
createAppElement | (appName, appProps) | 创建app React Element
setHoc | （hoc） | 设置最外层高阶React Element
fetch | 对象类型，不需要参数  | 提供fetch对象，可以调用后台接口，或者mock
navigate | 对象类型，不需要参数 | 提供navigate对象
render | (appName, targetHtmlElementName) | render
