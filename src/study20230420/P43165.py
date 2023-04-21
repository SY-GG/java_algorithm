from collections import deque
import os
os.system('cls')


def solution(numbers, target):
    answer = 0

    queue = deque()

    n = len(numbers)

    queue.append([0, numbers[0]])
    queue.append([0, -numbers[0]])

    while queue:
        idx = 0
        sum = 0
        print(queue)
        node = queue.popleft()
        idx, sum = node[0], node[1]

        if idx == n-1:
            # target이랑 비교해서 answer 만들기
            if sum == target:
                answer += 1
        else :
            print("node>", node)
            # 또 queue 만들기
            idx += 1
            queue.append([idx, sum + numbers[idx]])
            queue.append([idx, sum - numbers[idx]])

    return answer


# 5
# print('result: ', solution([1, 1, 1, 1, 1], 3))
# 2
print(solution([4, 1, 2, 1], 4))
