#알고리즘 수업 - 병합 정렬 1

def merge(A, p, q, r):
    global cnt, ans
    i, j = p, q+1
    tmp = []

    while i <= q and j <= r:
        if(A[i] <= A[j]):
            tmp.append(A[i])
            i += 1
        else:
            tmp.append(A[j])
            j += 1
    
    while i <= q:
        tmp.append(A[i])
        i += 1
    while j <= r:
        tmp.append(A[j])
        j += 1

    i, t = p, 0
    while i <= r:
        A[i] = tmp[t]
        cnt += 1
        if cnt == k:
            ans = A[i]
            break
        i += 1
        t += 1

def merge_sort(A,p,r):
    if(p < r and cnt <= k):
        q = (p+r) // 2
        merge_sort(A, p, q)
        merge_sort(A, q+1, r)
        merge(A, p, q, r)



n, k = map(int, input().split())
A = list(map(int, input().split()))
ans, cnt = -1, 0
merge_sort(A, 0, n-1)
print(ans)