---
id: version-1.0.0-ajax
title: Ajax
original_id: ajax
---
*You can use the 'fetch' object that provided by the maka engine to implement the ajax call. The followings is an example:*

*action.js*
```javascript
import {fetch} from 'maka'

...
fetch.post('/api/login',{user: 'admin', password: '123'})
...
```

*index.html, config the fetch object*
```javascript
    window.main = function (maka) {
        maka.utils.fetch.config({
            mock: false //default value is 'true'
        })
    }
```

*package.json, configuring local debug webpack dev server proxy*
```javascript
...
"server": {
    "proxy": {"api":"http://www.***.com:8080"},
    "port": 80
  }
...
```