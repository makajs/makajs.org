---
id: version-1.0.0-main-concepts-action
title: Action
original_id: main-concepts-action
---
``` js
@actionMixin('base')
class action {
    constructor(option) {
        Object.assign(this, option.mixins)
    }

    onChange = (e) => {
        this.base.setState({ 'data.input': e.target.value })
        console.log(this.base.getState('data.input'))
    }
}
```

- action很简单，可以理解为是一些提供给ui调用的函数
- actionMixin，混入外部action,缺省混入了maka引擎base,不可以去掉base
- 详细参见后面高级概念
