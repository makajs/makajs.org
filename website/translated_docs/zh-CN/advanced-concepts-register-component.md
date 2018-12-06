---
id: version-1.0.0-advanced-concepts-register-component
title: 如何使用自定义组件?
original_id: advanced-concepts-register-component
---

*view可以使用自定义组件或者外部的react组件，见下面示例*

```javascript
import React from 'react'
import { registerComponent } from 'maka'
import { Button } from 'antd'

class CustomComponent extends React.PureComponent {
    render() {
        return (<div>custom component</div>)
    }
}

registerComponent('CustomComponent', CustomComponent)
registerComponent('antd.Button', Button)

const view = {
    component: 'div',
    children: [{
        component: 'CustomComponent'
    },{
        component: 'antd.Button',
        children: 'Button'
    }]
}
```