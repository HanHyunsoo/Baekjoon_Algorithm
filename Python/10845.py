class Command:
    def __init__(self):
        self.q = []

    def set_input(self):
        command = input()
        self.input_arr = command.split(" ")

    def command_check(self):
        if self.input_arr[0] == "push":
            Command.push(self)
        elif self.input_arr[0] == "pop":
            Command.pop(self)
        elif self.input_arr[0] == "size":
            Command.size(self)
        elif self.input_arr[0] == "empty":
            Command.empty(self)
        elif self.input_arr[0] == "front":
            Command.front(self)
        else:
            Command.back(self)

    def push(self):
        self.q.append(self.input_arr[1])

    def pop(self):
        if len(self.q) > 0:
            print(self.q.pop(0))
        else:
            print(-1)

    def size(self):
        print(len(self.q))

    def empty(self):
        if len(self.q) == 0:
            print(1)
        else:
            print(0)

    def front(self):
        if len(self.q) > 0:
            print(self.q[0])
        else:
            print(-1)

    def back(self):
        if len(self.q) > 0:
            print(self.q[-1])
        else:
            print(-1)

test = Command()
for i in range(int(input())):
    test.set_input()
    test.command_check()
