short s = 5

long cc = 1234_5678_90123L

def colors = [red: '#FF0000', green: '#0FF00', blue: '#0000FF']
assert colors['red'] == '#FF0000'

def sayHello() {
	println "Hello World!"
}

def sayHello(String name) {
	println "Hello ${name}!"
}
sayHello("russell")