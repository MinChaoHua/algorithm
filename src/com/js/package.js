//闭包
function A(){
    var count = 0;
    function B(){
        count++;
        console.log(count)
    }
    return B;
}
var C = A();

C();
C();
C();

