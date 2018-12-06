---
id: version-1.0.0-advanced-concepts-register-action
title: ActionMixin
original_id: advanced-concepts-register-action
---

*The 'actionMixin' means the Action object mix up with external Action. The 'base' is required.*

- What functions are available from the base of the maka engine?

Function Name | Description | Example in Action | Example in View
--- | -- | --- | ---
getState  | get value in the state by path | this.base.getState('data.input') | $base.getState('data.input')
setState  | set value in the state by path | this.base.setState({'data.input', 'hello'}) | $base.setState({'data.input', 'hello'})
gs | =getState |  this.base.gs('data.input') | $base.gs('data.input')
ss | =setState | this.base.ss({'data.input', 'hello'}) |$base.ss({'data.input', 'hello'})

- To mix in custom action classes

```javascript
import { actionMixin, registerAction } from 'maka'

class CustomAction {
    alert = () => {
        alert()
    }
}

registerAction('CustomAction', CustomAction)

@actionMixin('base', 'CustomAction')
class action {
    constructor(option) {
        Object.assign(this, option.mixins)
    }
}

const view = {
    component: 'div',
    onClick: '{{$CustomAction.alert}}'
}
```