---
id: version-1.0.0-advanced-concepts-register-template
title: Custom template components
original_id: advanced-concepts-register-template
---
*Define some of the json fragments in the view object that are highly similar and frequently used as template components. When using this, the amount of code in the view object can be effectively reduced. See the example below.*

```javascript
import { registerTemplate } from 'maka'

const CustomTemplate = function(props) {
    return {
        component: 'div',
        children: [{
                component: 'div',
                children: props.content
            },{
                component: 'div',
                children: props.content
            }
        ]
    }
}

registerTemplate( 'CustomTemplate', customTemplate)

const view = {
    component: 'CustomTemplate'，
    content: 'hello'
}

```