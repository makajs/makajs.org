---
id: version-1.0.0-what-is-maka
title: What is maka?
original_id: what-is-maka
---
> 'Maka' comes from the Chinese word '码咖'(mǎkā), which means code guru.

> A front-end framework that you can understand at a glance, simplicity does not mean simple.

![Maka.js](../../../img/framework.png)


## Why Maka.js
Use maka.js to resolve these problems:
### 1、 React -- ugly syntax
When using React, the UI is complicated.
You may end up with multiple render functions, or a js statement within a jsx statement.
This results in the fact that the code can not clearly express the UI structure.

```javascript
render1(){
    return <div>1</div>
}
render2(){
    return <div>2</div>
}
render(){
    return (
        <div>
            {this.state.data.status == '1' ? render1() : render2()}
            {this.state.data.list.map((item)=>{
                return (
                    <div>
                        {item}
                    </div>
                )
            })}
        </div>
    )
}
```

MakaJs is based on React and can use all React controls. The only difference is to use json to express UI.
From Json's tree structure, we can clearly know what the ui is.

```javascript
{
    component: 'div',
    children:[{
        component:'div',
        children: '1',
        _visible: `{{data.status == '1'}}`
    },{
        component:'div',
        children: '2',
        _visible: `{{data.status != '1'}}`
    },{
        _for: 'item in data.list',
        component: 'div',
        children: '{{item}}'
    }]
}
```

### 2、Redux -- difficult to learn
Redux is a best implementation of Flux, but it is difficult for beginners to get started.
It proposes concepts such as connect, action, reducer, dispatch, store, middleware, etc.


MakaJs is based on Redux, you can only understand View, Action, State

### 3、Single page web application(SPA) -- very confusing file structure 
We normally use a technical perspective to classify files, components, actions, reducers, middleware.
Whereas the business developer is usually responsible for developing a module. If the files are scattered everywhere, the maintenance complexity is increased, and developers need to debug to determine if all the code on the website is correct.

```javascript
|---website
    |---package.json
    |---index.js
    |---actions
            |---loginAction.js
            |---portalAction.js
    |---reducers
            |---loginReducer.js
            |---portalReducer.js
    |---components
            |---login.js
            |---portal.js
    |---containers
            |---loginContainer.js
            |---portalContainer.js
```

MakaJs proposes the concept of App, which divides a website into multiple apps with the same development model. Each app can be run independently and debugged, and can be combined with low coupling.

```javascript
|---website
    |---package.json  (can use yarn start)
    |---index.js
    |---apps
          |---login
                |---view.js
                |---state.js
                |---action.js
                |---index.js
                |---package.json (can use yarn start)
          |---portal
                |---view.js
                |---state.js
                |---action.js
                |---index.js
                |---package.json (can use yarn start)
```    

### 4、Effectively accumulate your work results
The past framework has kept us tired and pursuing new technologies, and it is difficult to precipitate achievements at work.

MakaJs provides hub.makajs.org, which allows developers to share every runnable app. This accumulation will enable you to quickly develop a similar UI in the future.
