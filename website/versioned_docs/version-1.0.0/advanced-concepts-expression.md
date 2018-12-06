---
id: version-1.0.0-advanced-concepts-expression
title: Expression
original_id: advanced-concepts-expression
---
> All attribute values in the view support expressions

> Expressions can support javascript, see example below

## Examples

- Bind the data that path is 'data.content' in state.
```js
{
    ...
    value: `{{data.content}}`  //value = state.data.content
    ...
}
```

- Bind the function 'onChange' in the Action.
```js
{
    ...
    onChange:`{{$onChange}}` // onChange = action.$onChange
    ...
}

```

- Bind the anonymous function
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