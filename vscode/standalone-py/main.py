import tkinter as tk
from tkinter import messagebox

def on_button_click():
    messagebox.showinfo("Salutació", "Hola, món!")

def main():
    root = tk.Tk()
    root.title("Aplicació Standalone")

    greeting_button = tk.Button(root, text="Saluda", command=on_button_click)
    greeting_button.pack(pady=20)

    root.mainloop()

if __name__ == "__main__":
    main()