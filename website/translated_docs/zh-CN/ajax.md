---
id: version-1.0.0-ajax
title: ajax
original_id: ajax
---
*可以使用maka引擎提供fetch对象实现ajax，示例如下*

*action.js*
```javascript
import {fetch} from 'maka'

...
fetch.post('/v1/login',{user: 'admin', password: '123'})
...
```

*index.html, 配置fetch对象*
```javascript
    window.main = function (maka) {
        maka.utils.fetch.config({
            mock: false, //默认是true
            token: '', 
            after: function (response, url) {
                return response
            }
        })
    }
```

*package.json，配置本地调试的webpack dev server proxy*
```javascript
...
"server": {
    "proxy": {
        "/v1/*": {
            "target": "http://www.***.com:8080/"
        }
    },
    "port": 8000
  }
...
```