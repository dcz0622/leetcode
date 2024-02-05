# 1. Two Sum

## Problem Statement

Given an array of integers `nums` and an integer `target`, return indexes of the two numbers such that they add up to
`target`.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

## Example

```text
* Input: nums = [2, 7, 11, 15], target = 9
* Output: [0, 1]
* Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
```

```text
* Input: nums = [3, 2, 4], target = 6
* Output: [1, 2]
```

```text
* Input: nums = [3, 3], target = 6
* Output: [0, 1]
```

## Constraints

* `2 <= nums.length <= 10^4`
* `-10^9 <= nums[i] <= 10^9`
* `-10^9 <= target <= 10^9`
* Only one valid answer exists.

## Thought Process

For naive solution, we can enumerate all number pairs in `nums`, and check if they add up to `target`. Time complexity:
`O(n^2)`, where `n` is `nums.length`. Space complexity: `O(1)`.

For more efficient solution, we can trade time with space, and traverse through `nums` only once. While traversing,
since we know the current `num` and `target`, we can calculate `num2` that we are looking for. We use a hash table to
look for `num2`, rather than looking for `num2` one by one. Also, we do not need to pre-compute this hash table; we can
populate it as we traverse through `nums`. Time complexity: `O(n)`. Space complexity: `O(n)`.

The tricky part is that for our hash table, the key is a number, and the value is its array index. This might be a bit
counter-intuitive, because usually for hash table, we map from index to data.

## Tags

#Easy #Array #HashTable
