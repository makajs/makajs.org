---
id: version-1.0.0-advanced-concepts-props
title: 系统属性
original_id: advanced-concepts-props
---

```javascript
{
    component: 'div',
    children: 'hello',
    _visible: 'true'
}
```

 - 系统属性就是上面例子中的component、children、_visible等;

 - 除系统属性外还可以设置控件支持的任何属性;

 ## Props

- component
组件名，缺省可使用所有html元素
```javascript
{ component: 'div' } //<div></div>
```
- children
子组件
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

是否显示，值支持表达式, 默认true

```javascript
{
    component: 'div',
    _visible: false
}

```
*_visible设置为false,将不创建该组件*

- _for

循环,支持for嵌套

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
函数,当组件的某个属性要求是一个函数并返回react 元素时使用它

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