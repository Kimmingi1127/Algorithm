function solution(sides) {
    sides.sort((a, b) => a - b);
    var answer = sides[0] + sides[1] > sides[2] ? 1 : 2;
    return answer;
}