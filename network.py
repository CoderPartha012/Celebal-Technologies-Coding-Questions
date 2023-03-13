n, m = map(int, input().split())

# Initialize dictionary to count connections for each user
connections = {}
for i in range(1, n+1):
    connections[i] = 0

# Count connections for each user
for i in range(m):
    u, v = map(int, input().split())
    connections[u] += 1
    connections[v] += 1

# Find maximum connection count
max_connections = max(connections.values())

# Output user IDs with maximum connection count
influential_users = [k for k, v in connections.items() if v == max_connections]
influential_users.sort()
print(" ".join(str(user_id) for user_id in influential_users))
