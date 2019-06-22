function handler(context, payload){ 
    var path = context.getPath()
    var method = path.split('/').pop()
    if(!handlers[method]){
        return 'not found the handler for ' + path
    }
    var args = JSON.parse(payload)
    return handlers[method](args)
}

var handlers = {
    test:function(args){
        var DubboServiceHelper = Java.type('com.mk.eap.common.utils.DubboServiceHelper')
        var SysTaskDto = Java.type('com.mkdemo.erp.sys.dto.SysTaskDto');
        var itfName = "com.mkdemo.erp.sys.itf.ISysTaskService"

        var taskService = DubboServiceHelper.getService(itfName)
        var dto  = new SysTaskDto();
        if(args){
            Object.keys(args).forEach(k=>{
                dto[k] = args[k]
            })
        }
        
        var tasks = taskService.query(dto);

        return tasks

        //return 'test'
    },
    ping:function(args){
        var voBase = Java.type('com.mk.eap.common.domain.VO')
        var serializable = Java.type('java.io.Serializable')
        var taskVo = Java.extend(voBase, serializable, {
            serialVersionUID:1,
            id:1,
            code:'',
            name:''
        })
        var mapperBase = Java.type('com.mk.eap.entity.dao.EntityMapper<' + taskVo.class.getTypeName() + '>')
        var taskMapper = Java.extend(mapperBase)
        var mapper = new taskMapper();

        return mapper.selectAll()
 

        return args
    }
}
