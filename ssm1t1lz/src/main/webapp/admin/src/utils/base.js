const base = {
    get() {
        return {
            url : "http://localhost:8080/ssm1t1lz/",
            name: "ssm1t1lz",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssm1t1lz/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "书橱微信小程序"
        } 
    }
}
export default base
