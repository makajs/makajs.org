---
id: version-1.0.0-api
title: Maka Api
original_id: api
---

```javascript 
import {registerComponent, registerAction} from 'maka'
```
*As the example above, registerComponent and reigsterAction are two apis. All of the supported apis are as the followings:*

api | arguments |  description | 
--- | -- | -- | 
registerComponent | (key, component)  | register customer component
registerAction | (key, action) | register customer action
registerTemplate | (key, template) | register template component
getComponent | (key) | get component by name
load | [appName...] | load app
createAppElement | (appName, appProps) | create app React Element
setHoc | （hoc） | Set the outermost high-level React Element
fetch | Object type, no arguments required  | Provide a fetch object, you can call the background interface, or mock
navigate | Object type, no arguments required | Provide navigate object
render | (appName, targetHtmlElementName) | render
