class Student():
	ID = "S001"
	name = "John Doe"
	Email = "Johndoe97@gmail.com"

	def __str__(self):
		return "Car=>" + "[" + self.ID + ","+ self.name + "," + self.Email + "]"

	def setID(self, id):
		self.ID = id
		return self

	def setName(self, nName):
		self.name = nName
		return self

	def setEmail(self, email):
		self.Email= email
		return self

student = Student()
student.setid("S002").setName("Harry Potter").setEmail("potter.harry@gmail.com") 

print("Print Students...")
print(student)