---
id: version-1.0.0-app
title: App
original_id: app
---

*The maka app can be run, debugged, shared, or combined into a website by weak coupling.*


- Create a app
  - The 'maka app test' command will create a maka app called 'test'

- Add a sub-application
  - The 'maka add' command downloads the app from hub.makajs.org, similar to 'yarn add'.
  - The 'subAppDir' attribute in package.json points to the storage directory of the maka application.
  - Copy app.js and app.css to the distribution directory.
  
- Load a sub-application through the 'AppLoader' component

```javascript
const view = {
    component: 'div',
    className: 'hello',
    children: [{
        component: 'AppLoader',//AppLoader component provided by maka engine
        appName: 'app-test', //app name
        content: 'hello' //app supported properties
    }]
}
```

- Load a sub-application through the 'createAppElement' function
```javascript
import {createAppElement} from 'maka'
...
@actionMixin('base')
class action {
...
var subApp = createAppElement('appName', {content: 'hello'}) //The first parameter: app name, the second parameter: app props
...
}
```

- Preloading a sub-application
change index.html
```javascript
 maka.load(['appName1', 'appName2']).then(()=>{
     ...
 }
```

- Navigate to a sub-application

```javascript
import {navigate} from 'maka'

navigate.redirect('/appName/')
```