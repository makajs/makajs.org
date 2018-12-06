---
id: version-1.0.0-main-concepts-view
title: View
original_id: main-concepts-view
---

``` js
const view = {
    component: 'div',
    className: 'hello',
    children: [{
        component: 'div',
        children: '{{data.content + data.input}}'
    }, {
        component: 'input',
        placeholder: 'world',
        value: '{{data.input}}',
        onChange: '{{$onChange}}'
    }]
}
```

- The View object is JSON representation of react components.

``` html
<div class="testview">
    <div>{{data.content + data.input}}</div>
    <input placeholder="world" value="{{data.input}}" onChange="{{$onChange}}" />
</div> 
```
- View.html as above can be imported and auto transformed to JavaScript object
``` js
import view from './view.html'

```

- Please refer Advanced Concepts for more information.
