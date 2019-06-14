
/**
 * 语法  arr.reduce(callback,[initialValue])
 *
 *    callback （执行数组中每个值的函数，包含四个参数）
 *     1、previousValue （上一次调用回调返回的值，或者是提供的初始值（initialValue））
 *     2、currentValue （数组中当前被处理的元素）
 *     3、index （当前元素在数组中的索引）
 *     4、array （调用 reduce 的数组）
 *     initialValue （作为第一次调用 callback 的第一个参数。）
 *
 * */

var arr = [1, 2, 3, 4];
var sum = arr.reduce(function(prev, cur, index, arr) {
    console.log(prev, cur, index);
    return prev + cur;
})
console.log(arr, sum);


var  arr1 = [1, 2, 3, 4];
var sum1 = arr.reduce(function(prev, cur, index, arr) {
    console.log(prev, cur, index);
    return prev + cur;
},0) //注意这里设置了初始值
console.log(arr1, sum1);


//元素出现的次数
let names = ['Alice', 'Bob', 'Tiff', 'Bruce', 'Alice'];
let nameNum = names.reduce((pre,cur)=>{
    if(cur in pre){
        pre[cur]++
    }else{
        pre[cur] = 1
    }
    return pre
},{})
console.log(nameNum); //{Alice: 2, Bob: 1, Tiff: 1, Bruce: 1}

