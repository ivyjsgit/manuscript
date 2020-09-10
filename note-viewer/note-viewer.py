import io
from tkinter import *
from tkinter.ttk import * 


class Note:
    name = "Unnamed Note"
    lines = []
    def __init__(self, filename):
        with open(filename) as f:
            self.name = f.readline()
            print(f"Name: {self.name}")
            lines = f.read().split("\n")
            self.lines = self.turn_text_into_points(lines)
            
            print(self.lines[0].point_1.x)
            
    def turn_text_into_points(self,text_lines):
        lines = []
        for line_of_text in text_lines:
            splitted_by_semicolon = line_of_text.split(";")
            splitted_by_semicolon.remove('')

            for i in range(0,len(splitted_by_semicolon)-1,2):
                current_pair = splitted_by_semicolon[i].split(",")
                next_pair = splitted_by_semicolon[i+1].split(",")
                line = Line(Point(current_pair[0],current_pair[1]), Point(next_pair[0],next_pair[1]))

                lines.append(line)

        return lines

    def draw(self, canvas):
        for line in self.lines:
            print(f"Drawing {line.point_1.x} {line.point_1.y} {line.point_2.x} {line.point_2.y}")
            canvas.create_line(line.point_1.x,line.point_1.y,line.point_2.x,line.point_2.y)
            canvas.pack(fill = BOTH, expand = True)

class Point:
    x=-1
    y=-1
    def __init__(self,x,y):
        self.x=x
        self.y=y

class Line:
    point_1 = Point(-1,-1)
    point_2 = Point(-1,-1)

    def __init__(self, point_1, point_2):
        self.point_1=point_1
        self.point_2=point_2

if __name__ == "__main__":
    master = Tk()

    master.geometry("1280x800")
    canvas = Canvas(master)

    note = Note("/Users/ivy/Desktop/Senior Seminar/manuscript/note-viewer/test-note.txt")

    note.draw(canvas)

    master.mainloop()


