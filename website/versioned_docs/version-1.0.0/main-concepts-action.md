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

- The Action object contains functions that are provided to the view.
- The 'actionMixin' means the Action object mix up with external Action. The 'base' is required.
- Please refer Advanced Concepts for more information.