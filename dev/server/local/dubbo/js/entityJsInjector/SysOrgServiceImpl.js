function handler(args){ 
    if(handlers[args.event]){
        handlers[args.event](args)
    }
}
var handlers = {
    beforeCreate: function(args){ 
        
    } ,
    afterQuery: function(args){
        if(args.resultList.length > 0){
            args.resultList[0].description = "set by js hander, afterQuery" 
        }
    } 
}