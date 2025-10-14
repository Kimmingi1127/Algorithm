function solution(a, b) {
    var answer = 0;
    if (a > b) {
        var sum = a;
        a = b;
        b = sum;
    }
    
    for (var i = a; i <= b; i++) {
        answer += i;
    }
    return answer;
}