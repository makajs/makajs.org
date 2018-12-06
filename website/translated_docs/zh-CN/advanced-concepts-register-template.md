---
id: version-1.0.0-advanced-concepts-register-template
title: 如何自定义模板组件？
original_id: advanced-concepts-register-template
---
模板组件是为了减少view json的代码量提出的概念，把相似度很高、并且经常使用的一些json定义为模板组件，在使用中能有效减少代码量，见下面示例*

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