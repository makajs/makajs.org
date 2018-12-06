---
id: version-1.0.0-main-concepts-state
title: State
original_id: main-concepts-state
---

``` js
const state = {
    data: {
        content: 'hello ',
        input: ''
    }
}
```

- state很简单，可以理解为是应用的数据部分
- 引擎内部状态的存储结构是immutable类型
- 每次状态变化会通知view,重新render

