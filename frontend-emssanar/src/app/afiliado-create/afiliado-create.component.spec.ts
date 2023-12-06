import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AfiliadoCreateComponent } from './afiliado-create.component';

describe('AfiliadoCreateComponent', () => {
  let component: AfiliadoCreateComponent;
  let fixture: ComponentFixture<AfiliadoCreateComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AfiliadoCreateComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(AfiliadoCreateComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
