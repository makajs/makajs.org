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

- The state object provides data for the maka app
- The storage structure of the internal state of the maka engine is immutable type
- Every change of the state object will notify view and rerender

