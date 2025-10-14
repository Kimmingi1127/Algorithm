function solution(x) {
    var sum = 0;
    var str = String(x);
    
    for(var i = 0; i < str.length; i++){
        sum += Number(str[i]);
    }
    
    var answer = (x % sum == 0);
    return answer;
}