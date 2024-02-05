from typing import List


class Solution:

    def twoSum(self, nums: List[int], target: int) -> List[int]:
        numToIdxMap = {}

        for i, num in enumerate(nums):
            num2 = target - num

            if num2 in numToIdxMap:
                return [numToIdxMap[num2], i]
            else:
                numToIdxMap[num] = i


def main() -> None:
    solution = Solution()
    nums = [2, 7, 11, 15]
    target = 9
    print(solution.twoSum(nums, target))


if __name__ == '__main__':
    main()
