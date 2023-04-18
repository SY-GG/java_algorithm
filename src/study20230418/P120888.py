# 중복된 문자 제거
def solution(my_string):
    answer = ''
    for idx, str in enumerate(my_string):
        print(str, my_string[:idx])
        if str in my_string[:idx] : 
            print('->', my_string[idx])
        else :
            answer += str
    return answer