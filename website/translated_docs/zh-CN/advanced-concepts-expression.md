---
id: version-1.0.0-advanced-concepts-expression
title: Expression
original_id: advanced-concepts-expression
---
> view中的所有属性值支持表达式

> 表达式可以支持js语法，见下面示例

## Examples

- 绑定state中path为data.content的数据
```js
{
    ...
    value: `{{data.content}}`  //value = state.data.content
    ...
}
```

- 绑定action中方法名为onChange的函数
```js
{
    ...
    onChange:`{{$onChange}}` // onChange = action.$onChange
    ...
}

```

- 函数体
```js
{
    onChange: `{{{
        debugger;
        return $onChange
    }}}`

    /* 
    onChange = new Function(`
        debugger;
        return action.onChange
    `)() 
    */
}
```