---
id: version-1.0.0-navigate
title: Navigate
original_id: navigate
---


- redirect

```javascript
import {navigate} from 'maka'
navigate.redirect('/portal') //https://www.***.com/#/portal
```

- goBack

```javascript
import {navigate} from 'maka'
...
navigate.redirect('/sign-in') //https://www.***.com/#/sign-in
...
navigate.redirect('/portal') //https://www.***.com/#/portal
...
navigate.goBack() //https://www.***.com/#/sign-in
```

- listen 
```javascript
navigate.listen((location.action)=>{
    debugger
    //自定义处理
})
```