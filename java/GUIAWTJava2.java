import java.awt.*;

import javax.swing.border.Border;

public class GUIAWTJava2 extends Frame {
        Label lbl; // getText, setText, getAlignment, setAlignment --> Label.RIGHT
        Button btn1, btn2, btn3, btn4, btn; // getLabel, setLabel, setEnable -->ctor has label (actionevent)
        TextField txt; // getText, setText, setEditable -->ctor has columns, text
        TextArea txtArea; // append, getColumns, getRows, setColumns, setRows, insert(str,int pos) -->
                          // ctor has other +
                          // scrollbars(SCROLLBAR_BOTH/NONE/HORIZONTAL_ONLY/VERTICAL_ONLY)
        Checkbox chb; // getLable, getState, getSelectedObjects, setLabel, setState,
                      // setCheckboxGroup(CheckboxGroup g) (actionevent)
        CheckboxGroup g; // getSelectedCheckbox(), setSelectedCheckbox(). (checkboxes inside g are radio
                         // buttons)
        Choice ch; // add(String item), getItem(int index), getItemCount(), getSelectedIndex(),
                   // remove(int), removeAll(), select(int), select(string)
        List lt; // add(String), add(String, int), deselect(int), getItem(), getItemCount(),
                 // getItems(), getSelectedIndex, getSelectedIndexex, getSelectedItem,
                 // getSelectedItems, isIndexSelected, remove, removeAll, replaceItem
        Scrollbar sb; // getMaximum, getMinimum, getOrientation, getValue, setMaximum, setMinimum,
                      // setOrintation, setValue, setValues
        MenuBar mb; // add(Menu m), getMenu, getMenuCount, remove(int|MenuComponent)
        Menu m; // add(MenuItem mi), addSeperator(), getItem(int), getItemCount(), insert(mi,
                // pos), insertSeperator(pos), remove(index|MenuComponent) --> Menu(String lbl,
                // boolean tearof)
        MenuItem mi; // --> MenuItem(String lbl, MenuShortcut s), deleteShortcut(),
                     // set, getaActionCommand() (set, get command name of action event fired by
                     // menuItem), getLabel(), isEnabled(), setEnabled(boolean), setLabel(),
                     // setShortcut(s)
        CheckboxMenuItem cbmi; // getState(), setState()
        PopupMenu pm;
        Dialog d; // modal --> cant use other(parent's input is blocked) util d is active,
                  // modelles(not blocked) , getTitle, isModal, isResizable, setModal,
                  // setResizable, setTitle, setVisible
        FileDialog fd; // mode->FileDialog.LOAD|SAVE, getDirectory(), getFile(), getMode(),
                       // setDirectory(), setFile, setMode

        GUIAWTJava2() {

                btn1 = new Button("button1");
                btn2 = new Button("button2");
                btn3 = new Button("button3");
                btn4 = new Button("button4");
                btn = new Button("button");
                // Border layout:::
                /*
                 * setLayout(new BorderLayout());
                 * add(btn, BorderLayout.CENTER);
                 * add(btn1, BorderLayout.EAST);
                 * add(btn2, BorderLayout.WEST);
                 * add(btn3, BorderLayout.NORTH);
                 * add(btn4, BorderLayout.SOUTH);
                 */
                // Grid layout:::
                /*
                 * setLayout(new GridLayout(1, 2, 5, 5));
                 * add(btn);
                 * add(btn1);
                 * add(btn2);
                 * add(btn3);
                 * add(btn4);
                 */
                //
                // GridBag Layout:::
                /*
                 * setLayout(new GridBagLayout());
                 * GridBagConstraints gbc = new GridBagConstraints();
                 * gbc.gridx = 0;
                 * gbc.gridy = 0;
                 * gbc.ipadx = 0;
                 * gbc.ipady = 0;
                 * gbc.weightx = 0.55;
                 * gbc.weighty = 0.55;
                 * gbc.insets = new Insets(5, 5, 5, 5);
                 * gbc.fill = GridBagConstraints.NONE;
                 * gbc.anchor = GridBagConstraints.NORTH;
                 * gbc.gridheight = 1;
                 * gbc.gridwidth = 1;
                 * add(btn, gbc);
                 * gbc.gridx = 2;
                 * gbc.gridy = 3;
                 * gbc.gridwidth = 5;
                 * add(btn1, gbc);
                 * gbc.gridy = 0;
                 * gbc.gridwidth = 1;
                 * gbc.gridx = 5;
                 * add(btn2, gbc);
                 * gbc.gridx = 3;
                 * gbc.gridy = 2;
                 * gbc.gridheight = 5;
                 * add(btn3, gbc);
                 * gbc.gridx = 4;
                 * gbc.gridy = 4;
                 * gbc.gridwidth = 5;
                 * gbc.weightx = 1.5;
                 * gbc.weighty = 1.5;
                 * add(btn4, gbc);
                 */
                
                 setVisible(true);
                setSize(500, 500);

        }

        public static void main(String[] args) {
                new GUIAWTJava2();
        }
}
