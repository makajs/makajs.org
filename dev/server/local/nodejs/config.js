/**
 * server config
 * 
 */
const routes = require("./routes")
const auth = require("mk-service-auth")
const utils = require("mk-service-utils")
const dubbox = require("mk-service-dubbox")

const config = ({ services }) => {
    Object.assign(server.services, services)
    utils.api.env(server, 3);
    if (!server.port) {
        server.port = "8086"
    }
    if (server.configs.dubbox && !server.configs.dubbox.register) {
        server.configs.dubbox.register = "127.0.0.1:2181"
    }
    configServices(server)
    return server
}

const server = {
    host: "0.0.0.0",
    port: "${webport}",
    apiRootUrl: "/v1",
    website: utils.api.env(routes, 3),
    cors: {
        // exposedHeaders
        additionalHeaders: ['method', 'origin', 'x-requested-with', 'access-control-request-headers', 'content-type', 'access-control-request-method', 'accept', 'token', 'content-disposition', 'authorization']
    }, 
    services: {
        // referrenced service
        utils,
        dubbox,
        auth,
    },
    configs: {
        // serviceName: {}
        auth: { 
            secret: Buffer.from('/sys/user/login/token/Key', 'ascii'),
            tokenKeys: ["userId", "orgId", "versionId", "appId", "datacenter"],
            errorObj: { code: "40100", message: "未登录" },
            exclude: [
                "/test",
                "/sys/user/login",
                "/sys/user/regist",
                "/sys/org/test",
            ],
        },
        dubbox: {
            application: {
                name: "MK-R-Proxy"
            },
            discoveryInterfaces: ["com.mkdemo.erp.sys.itf.ISysInterfaceService"],
            register: "${zkserver}",
            dubboVer: "2.8.4a",
            fileTypeName: 'com.mk.eap.common.domain.FileDto', 
            errorTypeName: 'com.mk.eap.common.domain.BusinessException',
            timeout: 6000,
            returnNullValue: false,
        },
    },
} 

function configServices(server) {
    var { services, configs } = server;
    Object.keys(services).filter(k => !!services[k].config).forEach(k => {
        let curCfg = Object.assign({ server, services }, configs["*"], configs[k]);
        if (services.utils && services.utils.api.env) curCfg = services.utils.api.env(curCfg);
        services[k].config(curCfg);
    })
}

module.exports = config
