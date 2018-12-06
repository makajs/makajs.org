---
id: version-1.0.0-main-concepts-view
title: View
original_id: main-concepts-view
---

``` js
const view = {
    component: 'div',
    className: 'hello',
    children: [{
        component: 'div',
        children: '{{data.content + data.input}}'
    }, {
        component: 'input',
        placeholder: 'world',
        value: '{{data.input}}',
        onChange: '{{$onChange}}'
    }]
}
```

- view很简单，可以理解为react的json化表述
- component是react组件名
- 详细参见后面高级概念
