$.loadForObject = function (obj) {
    var jqObj = $(obj.el);
    var forTier = 1;

    function isArrayFn(value) {
        if (typeof Array.isArray === "function") {
            return Array.isArray(value);
        } else {
            return Object.prototype.toString.call(value) === "[object Array]";
        }
    }

    for(var a in obj.data){
        for(var o in obj.data[a]){
            if(isArrayFn(obj.data[a][o])){
                var jq1 = jqObj.find('.obj-for' + forTier);
                if(jq1.length != 0){
                    for (var a1 in obj.data[a][o]){

                    }
                }
            }
        }
    }

}