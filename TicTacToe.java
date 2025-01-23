import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class TicTacToe extends JFrame implements ActionListener {
    private JButton[] buttons = new JButton[9]; // 3x3 grid buttons
    private char currentPlayer = 'X'; // The current player, starting with 'X'
    private boolean isGameOver = false; // Flag to check if the game is over

    public TicTacToe() {
        // Initialize the frame
        setTitle("Tic-Tac-Toe Game");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 3)); // 3x3 grid layout

        // Create and add buttons to the frame
        for (int i = 0; i < 9; i++) {
            buttons[i] = new JButton("");
            buttons[i].setFont(new Font("Arial", Font.PLAIN, 60));
            buttons[i].setFocusPainted(false);
            buttons[i].addActionListener(this);
            add(buttons[i]);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton buttonClicked = (JButton) e.getSource(); // Get the button clicked

        // Check if the button is already clicked or game is over
        if (!buttonClicked.getText().equals("") || isGameOver) {
            return;
        }

        // Set the button text to current player's symbol (X or O)
        buttonClicked.setText(String.valueOf(currentPlayer));

        // Check if the current player has won
        if (checkWinner()) {
            JOptionPane.showMessageDialog(this, "Player " + currentPlayer + " wins!");
            isGameOver = true;
            return;
        }

        // Check if the game is a draw
        if (isBoardFull()) {
            JOptionPane.showMessageDialog(this, "It's a draw!");
            isGameOver = true;
            return;
        }

        // Switch to the next player
        currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
    }

    // Check if the board is full
    private boolean isBoardFull() {
        for (JButton button : buttons) {
            if (button.getText().equals("")) {
                return false;
            }
        }
        return true;
    }

    // Check for a winning condition
    private boolean checkWinner() {
        // Check rows, columns, and diagonals for a match
        return (checkRowColDiag(0, 1, 2) || checkRowColDiag(3, 4, 5) || checkRowColDiag(6, 7, 8) || // Rows
                checkRowColDiag(0, 3, 6) || checkRowColDiag(1, 4, 7) || checkRowColDiag(2, 5, 8) || // Columns
                checkRowColDiag(0, 4, 8) || checkRowColDiag(2, 4, 6));                              // Diagonals
    }

    // Check if three buttons in a row/column/diagonal match
    private boolean checkRowColDiag(int a, int b, int c) {
        return (!buttons[a].getText().equals("") && buttons[a].getText().equals(buttons[b].getText()) && buttons[a].getText().equals(buttons[c].getText()));
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            TicTacToe game = new TicTacToe();
            game.setVisible(true);
        });
    }
}
