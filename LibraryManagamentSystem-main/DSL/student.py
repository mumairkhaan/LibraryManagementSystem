class Student():
	ID = "S001"
	name = "Muhammad Umair"
	Email = "mumairkhaan@gmail.com"

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
student.setid("S002").setName("abc").setEmail("abc@gmail.com")

print("Print Students...")
print(student)
