function solution(n) {
    var x = Math.sqrt(n);
    var answer = (Number.isInteger(x)) ? (x + 1) **2 : -1;
    return answer;
}