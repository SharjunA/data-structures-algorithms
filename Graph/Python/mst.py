def find(parent, x):
    if parent[x] != x:
        parent[x] = find(parent, parent[x])
    return parent[x]

def union(parent, rank, x, y):
    root_x = find(parent, x)
    root_y = find(parent, y)

    if root_x != root_y:
        if rank[root_x] > rank[root_y]:
            parent[root_y] = root_x
        elif rank[root_x] < rank[root_y]:
            parent[root_x] = root_y
        else:
            parent[root_y] = root_x
            rank[root_x] += 1

def kruskal(n, edges):
    edges.sort(key=lambda x: x[2])  # sort by weight

    parent = [i for i in range(n)]
    rank = [0] * n
    mst_cost = 0

    for u, v, wt in edges:
        if find(parent, u) != find(parent, v):
            union(parent, rank, u, v)
            mst_cost += wt

    return mst_cost


# Example
edges = [
    (0, 1, 2),
    (1, 2, 3),
    (0, 3, 6),
    (1, 3, 8),
    (1, 4, 5),
    (2, 4, 7)
]

print(kruskal(5, edges))