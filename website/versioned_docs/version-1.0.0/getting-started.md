---
id: version-1.0.0-getting-started
title: Getting Started
original_id: getting-started
---

> The following example is to create a new maka app 'hello-world', and start the development server(<a href='http://localhost:8000' target='maka dev'>http://localhost:8000</a>)

``` bash
maka app hello-world
cd hello-world
yarn start
```
---
## Directory structure

<div><img src="../../../img/dirStructure.png"  /></div>

## Entry file

```javascript
import pkgJson from './package.json'
import { actionMixin } from 'maka'
import './style.less'

const name = pkgJson.name

const state = {
    data: {
        content: 'hello ',
        input: ''
    }
}

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

const view = {
    component: 'div',
    className: 'hello-world',
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

export {
    name,
    state,
    action,
    view
}
```

## Commands

- yarn start : Start the development server
- yarn build: Compile the application
- yarn pkg: Packaged application