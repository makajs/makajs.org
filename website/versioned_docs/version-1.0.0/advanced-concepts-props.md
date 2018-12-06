---
id: version-1.0.0-advanced-concepts-props
title: View reserved keywords
original_id: advanced-concepts-props
---

```javascript
{
    component: 'div',
    children: 'hello',
    _visible: 'true',
    _for: 'item in data.list',
    _function: '(a,b)'
}
```

 - The reserved keywords: component, children, _visible, _for, _function

 - In addition to the reserved keywords, you can set any properties supported by the component.

 ## Props

- component

Component name, all html elements are available by default

```javascript
{ component: 'div' } //<div></div>
```
- children

Child component

```javascript
{
    component: 'div'
    children: {
        component: 'div',
        children: 'children'
    }
}

/*
<div>
    <div>chidlren</div>
</div>
*/
```

- _visible

visible: the value can use expression, default value is true

```javascript
{
    component: 'div',
    _visible: false
}

```
*If _visible is set to false, the component will not be created.*

- _for

For loop, support multi-level for loop

```javascript
const state = {
    data: {
        list: [{a:1}, {a:2}, {a:3}]
    }
}

const view = {
    component: 'div',
    children: {
        _for: 'item in data.list', // or (item,index) in data.list
        component: 'div',
        children: '{{item.a}}'
    }
}
```

- _function

Function that is used when a component's property requires a function and returns a react element

```javascript

import {registerComponent} from 'maka'

class CustomComponent extends React.PureComponent {
    render(){
        var {getSub}  = this.props
        return (
            <div>
                {getSub('aaa','bbb')}
            </div>
        )
    }
}

registerComponent('CustomComponent', CustomComponent)

const view = {
    component: 'div',
    children: {
        component: 'CustomComponet'
        getSub: {
            _function: '(a,b)',
            component: 'div',
            children: '{{a+b}}'
        }
    }
}

```